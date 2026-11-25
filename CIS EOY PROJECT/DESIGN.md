Phase 1: Requirements & Design (15%)

Deliverable: Submit a DESIGN.md file in your repository containing:
UML Class Diagram: Illustrate your classes, properties, methods, and relationships.
Data Structure Selection: Explain why you chose specific java.util collections for your domain problem.
Big-O Expectations: List the expected Big-O time complexity for your primary operations (e.g., lookup, insertion, traversal).


Option C: Smart City Transit Card System (Hash Tables & Linked Lists)

Real-World Context: Urban Transit Fare Validation & Transfer Discounts.
The Problem: Subways process thousands of commuter card taps per minute. Turnstiles must instantly look up card balances and grant transfer discounts within a 90-minute window.
Core Challenge: Enable instant O(1) pass lookups while keeping track of recent trip history for transfer pricing.
Key Operations:
1. Register cards and update balances in constant time (O(1)).
2. Store each commuter's most recent station exit timestamp to automatically apply a 50% discount on transfers within 90 minutes.
3. Track and maintain a "Recent Taps" activity log using a capped history list.

Target Java Collections: HashMap<String, CommuterCard>, LinkedHashMap or LinkedList.
