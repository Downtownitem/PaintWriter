package Programs;

import java.awt.*;

public class Export {

    private static int lineCount = 1;
    private static int squareCount = 1;
    private static int triangleCount = 1;
    private static String code =
            "Graphics g = panel.getGraphics();\n" +
                    "        int x = 0;\n" +
                    "        int y = 0;\n" +
                    "        int[] xPoints = new int[0];\n" +
                    "        int[] yPoints = new int[0];\n";

    public static void appendLine(int[] xCords, int[] yCords, Color color) {
        code += "\n        // Line " + lineCount + "\n" +
                "        g.setColor(new Color(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + "));\n" +
                "        g.drawLine(x + " + xCords[0] + ", y + " + yCords[0] + ", x + " + xCords[1] + ", y + " + yCords[1] + ");\n";

        lineCount++;
    }

    public static void appendTriangle(int[] xCords, int[] yCords, Color color, boolean fill) {
        if (fill) {
            code += "\n        // Triangle " + triangleCount + "\n" +
                    "        g.setColor(new Color(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + "));\n" +
                    "        xPoints = new int[] {x + " + xCords[0] + ", x + " + xCords[1] + ", x + " + xCords[2] + "};\n" +
                    "        yPoints = new int[] {y + " + yCords[0] + ", y + " + yCords[1] + ", y + " + yCords[2] + "};\n" +
                    "        g.fillPolygon(xPoints, yPoints, 3);\n";
        } else {
            code += "\n        // Triangle " + triangleCount + "\n" +
                    "        g.setColor(new Color(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + "));\n" +
                    "        xPoints = new int[] {x + " + xCords[0] + ", x + " + xCords[1] + ", x + " + xCords[2] + "};\n" +
                    "        yPoints = new int[] {y + " + yCords[0] + ", y + " + yCords[1] + ", y + " + yCords[2] + "};\n" +
                    "        g.drawPolygon(xPoints, yPoints, 3);\n";
        }
        triangleCount++;
    }

    public static void appendSquare(int[] xCords, int[] yCords, Color color, boolean fill) {
        if (fill) {
            code += "\n        // Square " + squareCount + "\n" +
                    "        g.setColor(new Color(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + "));\n" +
                    "        xPoints = new int[] {x + " + xCords[0] + ", x + " + xCords[1] + ", x + " + xCords[2] + ", x + " + xCords[3] + "};\n" +
                    "        yPoints = new int[] {y +" + yCords[0] + ", y + " + yCords[1] + ", y + " + yCords[2] + ", y + " + yCords[3] + "};\n" +
                    "        g.fillPolygon(xPoints, yPoints, 4);\n";
        } else {
            code += "\n        // Square " + squareCount + "\n" +
                    "        g.setColor(new Color(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + "));\n" +
                    "        xPoints = new int[] {x + " + xCords[0] + ", x + " + xCords[1] + ", x + " + xCords[2] + ", x + " + xCords[3] + "};\n" +
                    "        yPoints = new int[] {y +" + yCords[0] + ", y + " + yCords[1] + ", y + " + yCords[2] + ", y + " + yCords[3] + "};\n" +
                    "        g.drawPolygon(xPoints, yPoints, 4);\n";
        }
        squareCount++;
    }

    public static String getCode() {
        return code;
    }

    public static void resetCode() {
        code = "Graphics g = panel.getGraphics();\n" +
                "        int x = 0;\n" +
                "        int y = 0;\n" +
                "        int[] xPoints = new int[0];\n" +
                "        int[] yPoints = new int[0];\n";
        lineCount = 1;
        squareCount = 1;
        triangleCount = 1;
    }

}
