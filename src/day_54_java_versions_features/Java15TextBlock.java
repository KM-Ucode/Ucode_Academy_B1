package day_54_java_versions_features;

public class Java15TextBlock {
    public static void main(String[] args) {

        // Regular way of String using double quotes
        String text = "In the ever-evolving world of technology, programming languages play a crucial role " +
                "in shaping the digital landscape. Among the numerous options available, Java stands out " +
                "as one of the most versatile and powerful languages, with a rich history and a promising" +
                " future. From enterprise-level applications to Android development, Java offers a wide" +
                " range of possibilities for developers. In this blog, we will explore the strengths of " +
                "Java, its applications, and the advantages it brings to modern development.";

        // Using Text block """ """
        String textBlock = """
                In the ever-evolving world of technology, programming languages play a crucial role in
                 shaping the digital landscape. Among the numerous options available, Java stands out 
                 as one of the most versatile and powerful languages, with a rich history and a promising
                  future. From enterprise-level applications to Android development, Java offers a wide 
                  range of possibilities for developers. In this blog, we will explore the strengths of 
                  Java, its applications, and the advantages it brings to modern development.""";
    }
}
