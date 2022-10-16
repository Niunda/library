module library.models.main {
    requires static lombok;
    exports vk.course.model;
    opens vk.course.model to com.google.gson;
}