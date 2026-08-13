.class public Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;
.super Ljava/lang/Object;


# instance fields
.field private hFd:I

.field private final m:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->m:[B

    const/4 v0, 0x0

    iput v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->m:[B

    iput p2, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    return-void
.end method


# virtual methods
.method D(I)I
    .locals 2

    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->m:[B

    iget v1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    add-int/2addr v1, p1

    aget-byte v0, v0, v1

    invoke-static {v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MyApplication$a;->spw(B)I

    move-result v0

    return v0
.end method

.method aH(I)B
    .locals 2

    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->m:[B

    iget v1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    add-int/2addr v1, p1

    aget-byte v0, v0, v1

    return v0
.end method

.method public g(II)V
    .locals 4

    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->m:[B

    iget v1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    add-int v2, v1, p2

    int-to-byte v3, p1

    invoke-static {v0, v1, v2, v3}, Ljava/util/Arrays;->fill([BIIB)V

    return-void
.end method

.method public k(I)V
    .locals 1

    iget v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    return-void
.end method

.method public lnE(I)Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;
    .locals 3

    new-instance v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;

    iget-object v1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->m:[B

    iget v2, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    add-int/2addr v2, p1

    invoke-direct {v0, v1, v2}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;-><init>([BI)V

    return-object v0
.end method

.method ml(II)[B
    .locals 4

    new-array v0, p2, [B

    iget-object v1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->m:[B

    iget v2, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    add-int/2addr v2, p1

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method mon(IB)V
    .locals 2

    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->m:[B

    iget v1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    add-int/2addr v1, p1

    aput-byte p2, v0, v1

    return-void
.end method

.method wl([BI)V
    .locals 4

    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->m:[B

    iget v1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$b;->hFd:I

    add-int/2addr v1, p2

    array-length v2, p1

    const/4 v3, 0x0

    invoke-static {p1, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
