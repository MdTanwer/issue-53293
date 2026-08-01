package org.acme

import io.quarkus.data.hibernate.ManagedRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingRepository : ManagedRepository<GreetingEntity>
