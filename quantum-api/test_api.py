import requests

url = "http://127.0.0.1:5000/generate"
data = {
    "num_bits": 5,
    "num_random_numbers": 3
}

# Send a POST request to the API
response = requests.post(url, json=data)

# Print the response from the API
if response.status_code == 200:
    print("Response from API:", response.json())
else:
    print("Failed to connect to API. Status code:", response.status_code)
