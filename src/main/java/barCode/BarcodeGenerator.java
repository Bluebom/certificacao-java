package barCode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import database.DBManager;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class BarcodeGenerator {

    BarcodeGenerator(String barcodeContent, String barcodeTitle, String barcodeDescription) {
        new BarcodeGenerator(barcodeContent, barcodeTitle, barcodeDescription, "png");
    }

    BarcodeGenerator(String barcodeId, String barcodeTitle, String barcodeDescription, String format)
    {
        DBManager db = new DBManager();
        String createTableQuery = "CREATE TABLE IF NOT EXISTS products (" +
                "id varchar(36) PRIMARY KEY, " +
                "title varchar(100), " +
                "path text, " +
                "description TEXT)";
        try {
            db.statement.execute(createTableQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        int width = 300;
        int height = 300;

        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        QRCodeWriter writer = new QRCodeWriter();
        try {
            BitMatrix matrix = writer.encode(barcodeId, BarcodeFormat.QR_CODE, width, height, hints);
            String barcodePath = barcodeId+".png";
            Path path = FileSystems.getDefault().getPath(barcodePath);
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);
            String insertIntoProductsQuery = "INSERT into products (id, title, path, description) values"+
                    "(\""+barcodeId+"\", \""+barcodeTitle+"\", \""+barcodePath+"\", \""+barcodeDescription+"\")";
            db.statement.execute(insertIntoProductsQuery);
            System.out.println("Image saved successfully.");
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
