.class public final enum LL7/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL7/h$a;
    }
.end annotation


# static fields
.field public static final G:LL7/h$a;

.field public static final H:Ljava/util/Set;

.field public static final enum I:LL7/h;

.field public static final enum J:LL7/h;

.field public static final enum K:LL7/h;

.field public static final enum L:LL7/h;

.field public static final enum M:LL7/h;

.field public static final enum N:LL7/h;

.field public static final enum O:LL7/h;

.field public static final enum P:LL7/h;

.field private static final synthetic Q:[LL7/h;

.field private static final synthetic R:Lp7/a;


# instance fields
.field private final C:Ln8/f;

.field private final D:Ln8/f;

.field private final E:Li7/n;

.field private final F:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, LL7/h;

    const/4 v1, 0x0

    const-string v2, "Boolean"

    const-string v3, "BOOLEAN"

    invoke-direct {v0, v3, v1, v2}, LL7/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LL7/h;->I:LL7/h;

    new-instance v0, LL7/h;

    const/4 v2, 0x1

    const-string v3, "Char"

    const-string v4, "CHAR"

    invoke-direct {v0, v4, v2, v3}, LL7/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LL7/h;->J:LL7/h;

    new-instance v3, LL7/h;

    const/4 v4, 0x2

    const-string v5, "Byte"

    const-string v6, "BYTE"

    invoke-direct {v3, v6, v4, v5}, LL7/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, LL7/h;->K:LL7/h;

    new-instance v5, LL7/h;

    const/4 v6, 0x3

    const-string v7, "Short"

    const-string v8, "SHORT"

    invoke-direct {v5, v8, v6, v7}, LL7/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, LL7/h;->L:LL7/h;

    new-instance v7, LL7/h;

    const/4 v8, 0x4

    const-string v9, "Int"

    const-string v10, "INT"

    invoke-direct {v7, v10, v8, v9}, LL7/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, LL7/h;->M:LL7/h;

    new-instance v9, LL7/h;

    const/4 v10, 0x5

    const-string v11, "Float"

    const-string v12, "FLOAT"

    invoke-direct {v9, v12, v10, v11}, LL7/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, LL7/h;->N:LL7/h;

    new-instance v11, LL7/h;

    const/4 v12, 0x6

    const-string v13, "Long"

    const-string v14, "LONG"

    invoke-direct {v11, v14, v12, v13}, LL7/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, LL7/h;->O:LL7/h;

    new-instance v13, LL7/h;

    const/4 v14, 0x7

    const-string v15, "Double"

    const-string v12, "DOUBLE"

    invoke-direct {v13, v12, v14, v15}, LL7/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, LL7/h;->P:LL7/h;

    invoke-static {}, LL7/h;->e()[LL7/h;

    move-result-object v12

    sput-object v12, LL7/h;->Q:[LL7/h;

    invoke-static {v12}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v12

    sput-object v12, LL7/h;->R:Lp7/a;

    new-instance v12, LL7/h$a;

    const/4 v15, 0x0

    invoke-direct {v12, v15}, LL7/h$a;-><init>(Ly7/k;)V

    sput-object v12, LL7/h;->G:LL7/h$a;

    new-array v12, v14, [LL7/h;

    aput-object v0, v12, v1

    aput-object v3, v12, v2

    aput-object v5, v12, v4

    aput-object v7, v12, v6

    aput-object v9, v12, v8

    aput-object v11, v12, v10

    const/4 v0, 0x6

    aput-object v13, v12, v0

    invoke-static {v12}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LL7/h;->H:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    invoke-static {p3}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p1

    const-string p2, "identifier(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LL7/h;->C:Ln8/f;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "Array"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p1

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LL7/h;->D:Ln8/f;

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance p2, LL7/h$c;

    invoke-direct {p2, p0}, LL7/h$c;-><init>(LL7/h;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p2

    iput-object p2, p0, LL7/h;->E:Li7/n;

    new-instance p2, LL7/h$b;

    invoke-direct {p2, p0}, LL7/h$b;-><init>(LL7/h;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LL7/h;->F:Li7/n;

    return-void
.end method

.method private static final synthetic e()[LL7/h;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [LL7/h;

    sget-object v1, LL7/h;->I:LL7/h;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LL7/h;->J:LL7/h;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LL7/h;->K:LL7/h;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LL7/h;->L:LL7/h;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LL7/h;->M:LL7/h;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LL7/h;->N:LL7/h;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, LL7/h;->O:LL7/h;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, LL7/h;->P:LL7/h;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LL7/h;
    .locals 1

    const-class v0, LL7/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LL7/h;

    return-object p0
.end method

.method public static values()[LL7/h;
    .locals 1

    sget-object v0, LL7/h;->Q:[LL7/h;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LL7/h;

    return-object v0
.end method


# virtual methods
.method public final g()Ln8/c;
    .locals 1

    iget-object v0, p0, LL7/h;->F:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln8/c;

    return-object v0
.end method

.method public final i()Ln8/f;
    .locals 1

    iget-object v0, p0, LL7/h;->D:Ln8/f;

    return-object v0
.end method

.method public final m()Ln8/c;
    .locals 1

    iget-object v0, p0, LL7/h;->E:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln8/c;

    return-object v0
.end method

.method public final n()Ln8/f;
    .locals 1

    iget-object v0, p0, LL7/h;->C:Ln8/f;

    return-object v0
.end method
