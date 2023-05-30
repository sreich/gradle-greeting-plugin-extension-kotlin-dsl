tasks.register<com.example.GreetingTask>("greet") {
    greeting.set("Hello from 'myproject.greeting' plugin")
}

/**
 * this is broken and unable to resolve these symbols. plugin creation issue? maybe with implementation class?
 * This project should be treated as separate, i want it to get resolved from a totally
 * separate, non included build. i should be able to resolve these extensions from here, when they were defined
 * relative to
 * @see `myproject.java-conventions.gradle.kts`
 *
 * my intention is to be able to use it like this, as well as doing e.g. greeting { } in my standalone kotlin dsl build script project
 */
val extension = project.extensions.create<GreetingPluginExtension>("greeting")
