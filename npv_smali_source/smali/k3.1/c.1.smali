.class public final enum Lk3/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:Lk3/c;

.field public static final enum E:Lk3/c;

.field public static final enum F:Lk3/c;

.field public static final enum G:Lk3/c;

.field public static final enum H:Lk3/c;

.field public static final enum I:Lk3/c;

.field private static final synthetic J:[Lk3/c;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lk3/c;

    const-string v1, "BANNER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lk3/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk3/c;->D:Lk3/c;

    new-instance v1, Lk3/c;

    const-string v3, "INTERSTITIAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lk3/c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lk3/c;->E:Lk3/c;

    new-instance v3, Lk3/c;

    const-string v5, "REWARDED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lk3/c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lk3/c;->F:Lk3/c;

    new-instance v5, Lk3/c;

    const-string v7, "REWARDED_INTERSTITIAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lk3/c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lk3/c;->G:Lk3/c;

    new-instance v7, Lk3/c;

    const-string v9, "NATIVE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lk3/c;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lk3/c;->H:Lk3/c;

    new-instance v9, Lk3/c;

    const/4 v11, 0x5

    const/4 v12, 0x6

    const-string v13, "APP_OPEN_AD"

    invoke-direct {v9, v13, v11, v12}, Lk3/c;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lk3/c;->I:Lk3/c;

    new-array v12, v12, [Lk3/c;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    aput-object v7, v12, v10

    aput-object v9, v12, v11

    sput-object v12, Lk3/c;->J:[Lk3/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lk3/c;->C:I

    return-void
.end method

.method public static e(I)Lk3/c;
    .locals 5

    .prologue
    invoke-static {}, Lk3/c;->values()[Lk3/c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lk3/c;->g()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lk3/c;
    .locals 1

    const-class v0, Lk3/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk3/c;

    return-object p0
.end method

.method public static values()[Lk3/c;
    .locals 1

    sget-object v0, Lk3/c;->J:[Lk3/c;

    invoke-virtual {v0}, [Lk3/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk3/c;

    return-object v0
.end method


# virtual methods
.method public g()I
    .locals 1

    iget v0, p0, Lk3/c;->C:I

    return v0
.end method
