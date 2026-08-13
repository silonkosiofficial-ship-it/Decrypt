.class public final enum LL7/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:LL7/l;

.field public static final enum F:LL7/l;

.field public static final enum G:LL7/l;

.field public static final enum H:LL7/l;

.field private static final synthetic I:[LL7/l;

.field private static final synthetic J:Lp7/a;


# instance fields
.field private final C:Ln8/b;

.field private final D:Ln8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LL7/l;

    const-string v1, "kotlin/UByteArray"

    invoke-static {v1}, Ln8/b;->e(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    const-string v2, "fromString(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "UBYTEARRAY"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1}, LL7/l;-><init>(Ljava/lang/String;ILn8/b;)V

    sput-object v0, LL7/l;->E:LL7/l;

    new-instance v0, LL7/l;

    const-string v1, "kotlin/UShortArray"

    invoke-static {v1}, Ln8/b;->e(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "USHORTARRAY"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1}, LL7/l;-><init>(Ljava/lang/String;ILn8/b;)V

    sput-object v0, LL7/l;->F:LL7/l;

    new-instance v0, LL7/l;

    const-string v1, "kotlin/UIntArray"

    invoke-static {v1}, Ln8/b;->e(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "UINTARRAY"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1}, LL7/l;-><init>(Ljava/lang/String;ILn8/b;)V

    sput-object v0, LL7/l;->G:LL7/l;

    new-instance v0, LL7/l;

    const-string v1, "kotlin/ULongArray"

    invoke-static {v1}, Ln8/b;->e(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "ULONGARRAY"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, LL7/l;-><init>(Ljava/lang/String;ILn8/b;)V

    sput-object v0, LL7/l;->H:LL7/l;

    invoke-static {}, LL7/l;->e()[LL7/l;

    move-result-object v0

    sput-object v0, LL7/l;->I:[LL7/l;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LL7/l;->J:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILn8/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LL7/l;->C:Ln8/b;

    invoke-virtual {p3}, Ln8/b;->j()Ln8/f;

    move-result-object p1

    const-string p2, "getShortClassName(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LL7/l;->D:Ln8/f;

    return-void
.end method

.method private static final synthetic e()[LL7/l;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LL7/l;

    sget-object v1, LL7/l;->E:LL7/l;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LL7/l;->F:LL7/l;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LL7/l;->G:LL7/l;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LL7/l;->H:LL7/l;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LL7/l;
    .locals 1

    const-class v0, LL7/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LL7/l;

    return-object p0
.end method

.method public static values()[LL7/l;
    .locals 1

    sget-object v0, LL7/l;->I:[LL7/l;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LL7/l;

    return-object v0
.end method


# virtual methods
.method public final g()Ln8/f;
    .locals 1

    iget-object v0, p0, LL7/l;->D:Ln8/f;

    return-object v0
.end method
