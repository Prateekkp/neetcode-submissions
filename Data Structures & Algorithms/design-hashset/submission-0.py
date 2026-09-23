class MyHashSet:

    def __init__(self):
        self.buckets = [[] for _ in range(1000)]

    def add(self, key: int) -> None:
        index = key % 1000

        if key not in self.buckets[index]:
            self.buckets[index].append(key)

    def remove(self, key: int) -> None:
        index = key % 1000

        if key in self.buckets[index]:
            self.buckets[index].remove(key)

    def contains(self, key: int) -> bool:
        index = key % 1000

        return key in self.buckets[index]
        


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)