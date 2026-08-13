.class public final enum LL7/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum F:LL7/m;

.field public static final enum G:LL7/m;

.field public static final enum H:LL7/m;

.field public static final enum I:LL7/m;

.field private static final synthetic J:[LL7/m;

.field private static final synthetic K:Lp7/a;


# instance fields
.field private final C:Ln8/b;

.field private final D:Ln8/f;

.field private final E:Ln8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LL7/m;

    const-string v1, "kotlin/UByte"

    invoke-static {v1}, Ln8/b;->e(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    const-string v2, "fromString(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "UBYTE"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1}, LL7/m;-><init>(Ljava/lang/String;ILn8/b;)V

    sput-object v0, LL7/m;->F:LL7/m;

    new-instance v0, LL7/m;

    const-string v1, "kotlin/UShort"

    invoke-static {v1}, Ln8/b;->e(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "USHORT"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1}, LL7/m;-><init>(Ljava/lang/String;ILn8/b;)V

    sput-object v0, LL7/m;->G:LL7/m;

    new-instance v0, LL7/m;

    const-string v1, "kotlin/UInt"

    invoke-static {v1}, Ln8/b;->e(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "UINT"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1}, LL7/m;-><init>(Ljava/lang/String;ILn8/b;)V

    sput-object v0, LL7/m;->H:LL7/m;

    new-instance v0, LL7/m;

    const-string v1, "kotlin/ULong"

    invoke-static {v1}, Ln8/b;->e(Ljava/lang/String;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "ULONG"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, LL7/m;-><init>(Ljava/lang/String;ILn8/b;)V

    sput-object v0, LL7/m;->I:LL7/m;

    invoke-static {}, LL7/m;->e()[LL7/m;

    move-result-object v0

    sput-object v0, LL7/m;->J:[LL7/m;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LL7/m;->K:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILn8/b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LL7/m;->C:Ln8/b;

    invoke-virtual {p3}, Ln8/b;->j()Ln8/f;

    move-result-object p1

    const-string p2, "getShortClassName(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LL7/m;->D:Ln8/f;

    new-instance p2, Ln8/b;

    invoke-virtual {p3}, Ln8/b;->h()Ln8/c;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "Array"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    iput-object p2, p0, LL7/m;->E:Ln8/b;

    return-void
.end method

.method private static final synthetic e()[LL7/m;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LL7/m;

    sget-object v1, LL7/m;->F:LL7/m;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LL7/m;->G:LL7/m;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LL7/m;->H:LL7/m;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LL7/m;->I:LL7/m;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LL7/m;
    .locals 1

    const-class v0, LL7/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LL7/m;

    return-object p0
.end method

.method public static values()[LL7/m;
    .locals 1

    sget-object v0, LL7/m;->J:[LL7/m;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LL7/m;

    return-object v0
.end method


# virtual methods
.method public final g()Ln8/b;
    .locals 1

    iget-object v0, p0, LL7/m;->E:Ln8/b;

    return-object v0
.end method

.method public final i()Ln8/b;
    .locals 1

    iget-object v0, p0, LL7/m;->C:Ln8/b;

    return-object v0
.end method

.method public final m()Ln8/f;
    .locals 1

    iget-object v0, p0, LL7/m;->D:Ln8/f;

    return-object v0
.end method
