package org.acme

import io.quarkus.data.hibernate.ManagedEntity
import jakarta.persistence.Entity

@Entity
class GreetingEntity(val field: String? = null) : ManagedEntity() {
}
