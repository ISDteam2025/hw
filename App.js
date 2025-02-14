//2201140028
import constant from 'expo-constants';
import { StyleSheet, Text, TextInput, View, KeyboardAvoidingView, Platform, Image, ScrollView, FlatList, TouchableOpacity } from 'react-native';
import { useState } from 'react';

const Products = [
  {
    id: "1",
    name: "Apple iPhone 14",
    price: "799",
    description: "Smartphone by Apple",
  },
  {
    id: "2",
    name: "Samsung Galaxy S23",
    price: "699",
    description: "Flagship phone by Samsung",
  },
  {
    id: "3",
    name: "Sony WH-1000XM5",
    price: "399",
    description: "Noise-canceling headphones",
  },
];

export default function App() {
  const [products, setProducts] = useState(Products);
  const [name, setName] = useState('');
  const [price, setPrice] = useState('');
  const [description, setDescription] = useState('');
  const addProduct = () => {
    if (!name.trim() || !price.trim()) {
      alert('Please fill in name and price!');
      return;
    }

    if (name.trim().length < 3) {
      alert('Product name must be longer than 3 characters!');
      return;
    }

    const priceNumber = parseFloat(price.trim());
    if (isNaN(priceNumber) || priceNumber <= 0) {
      alert('Price must be a positive number!');
      return;
    }
    const newProduct = {
      id: (products.length + 1).toString(),
      name: name.trim(),
      price: price.trim(),
      description: description.trim(),
    };

    setProducts([...products, newProduct]);
    setName('');
    setPrice('');
    setDescription('');
  };
  console.log('App executed');
  return (
    <KeyboardAvoidingView style={{ flex: 1 }}>
      <View style={styles.inner}>
      <Text style={{
        fontSize: 24,
        fontWeight: 'bold',
        marginBottom: 20,
      }}>Product Management App</Text>
      <FlatList
        data={products}
        keyExtractor={(item) => item.id}
        renderItem={({ item }) => (
          <View style={styles.item}>
            <Text style={styles.itemtext}>{item.name}</Text>
            <Text style={styles.itemtext}>${item.price}</Text>
            <Text style={styles.itemtext}>{item.description}</Text>
          </View>
        )}
        style={styles.list}
      />
        <TextInput  
          style={styles.textinput} 
          placeholder="Product Name"
          value={name}
          onChangeText={setName}
        />
        <TextInput  
          style={styles.textinput} 
          placeholder="Price"
          value={price}
          onChangeText={setPrice}
        />
        <TextInput  
          style={styles.textinput} 
          placeholder="Description"
          value={description}
          onChangeText={setDescription}
        />
        <TouchableOpacity style={styles.button} onPress={addProduct}>
          <Text style={styles.buttonText}>Add Product</Text>
        </TouchableOpacity>
      </View>
    </KeyboardAvoidingView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
    backgroundColor: '#f5f5f5',
  },
  inner: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  textinput: {
    height: 40, 
    borderColor: 'gray', 
    borderWidth: 1, 
    marginBottom: 15 , 
    paddingLeft: 5, 
    width: '80%' 
  },
  button: {
    backgroundColor: '#007bff',
    borderRadius: 8,
    padding: 15,
    alignItems: 'center',
    marginBottom: 20,
  },
  buttonText: {
    color: 'white',
    fontWeight: 'bold',
  },
  item: {
    backgroundColor: '#D3D3D3',
    padding: 15,
    borderRadius: 10,
    marginBottom: 10,
    width: 400  ,
  },
  itemtext: {
    fontSize: 17,
    justifyContent: 'center',
  },
});
