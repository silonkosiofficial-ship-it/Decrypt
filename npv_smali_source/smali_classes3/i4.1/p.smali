.class public final enum Li4/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:Li4/p;

.field public static final enum E:Li4/p;

.field public static final enum F:Li4/p;

.field public static final enum G:Li4/p;

.field private static final synthetic H:[Li4/p;


# instance fields
.field private final C:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Li4/p;

    const/4 v1, 0x0

    const-string v2, "uninitialized"

    const-string v3, "UNINITIALIZED"

    invoke-direct {v0, v3, v1, v2}, Li4/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li4/p;->D:Li4/p;

    new-instance v2, Li4/p;

    const/4 v3, 0x1

    const-string v4, "eu_consent_policy"

    const-string v5, "POLICY"

    invoke-direct {v2, v5, v3, v4}, Li4/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Li4/p;->E:Li4/p;

    new-instance v4, Li4/p;

    const/4 v5, 0x2

    const-string v6, "denied"

    const-string v7, "DENIED"

    invoke-direct {v4, v7, v5, v6}, Li4/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Li4/p;->F:Li4/p;

    new-instance v6, Li4/p;

    const/4 v7, 0x3

    const-string v8, "granted"

    const-string v9, "GRANTED"

    invoke-direct {v6, v9, v7, v8}, Li4/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Li4/p;->G:Li4/p;

    const/4 v8, 0x4

    new-array v8, v8, [Li4/p;

    aput-object v0, v8, v1

    aput-object v2, v8, v3

    aput-object v4, v8, v5

    aput-object v6, v8, v7

    sput-object v8, Li4/p;->H:[Li4/p;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Li4/p;->C:Ljava/lang/String;

    return-void
.end method

.method public static values()[Li4/p;
    .locals 1

    sget-object v0, Li4/p;->H:[Li4/p;

    invoke-virtual {v0}, [Li4/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li4/p;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li4/p;->C:Ljava/lang/String;

    return-object v0
.end method
