package barCode;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import database.DBManager;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;

public class BarcodeReader {
    BarcodeReader(String imageFilePath)
    {
        try {
            BufferedImage image = ImageIO.read(new File(imageFilePath));
            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));

            MultiFormatReader reader = new MultiFormatReader();
            Result result = reader.decode(binaryBitmap);

            String uuid = result.getText();
            DBManager db = new DBManager();
            String selectTable = "select * from products pr where pr.id = \""+uuid+"\";";
            ResultSet resultSet = db.statement.executeQuery(selectTable);

            // Process the query results
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");

                System.out.println("ID: " + id);
                System.out.println("Title: " + title);
                System.out.println("Description: " + description);
                System.out.println("-----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

