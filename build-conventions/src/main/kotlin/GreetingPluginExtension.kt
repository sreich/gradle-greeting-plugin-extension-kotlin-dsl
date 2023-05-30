import org.gradle.api.provider.Property

interface GreetingPluginExtension {
    val message: Property<String>
    val greeter: Property<String>
}
