.class public final enum Lz9/i0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lz9/i0;

.field public static final enum F:Lz9/i0;

.field public static final enum G:Lz9/i0;

.field public static final enum H:Lz9/i0;

.field private static final synthetic I:[Lz9/i0;

.field private static final synthetic J:Lp7/a;


# instance fields
.field public final C:C

.field public final D:C


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lz9/i0;

    const-string v1, "OBJ"

    const/4 v2, 0x0

    const/16 v3, 0x7b

    const/16 v4, 0x7d

    invoke-direct {v0, v1, v2, v3, v4}, Lz9/i0;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, Lz9/i0;->E:Lz9/i0;

    new-instance v0, Lz9/i0;

    const-string v1, "LIST"

    const/4 v2, 0x1

    const/16 v5, 0x5b

    const/16 v6, 0x5d

    invoke-direct {v0, v1, v2, v5, v6}, Lz9/i0;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, Lz9/i0;->F:Lz9/i0;

    new-instance v0, Lz9/i0;

    const-string v1, "MAP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lz9/i0;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, Lz9/i0;->G:Lz9/i0;

    new-instance v0, Lz9/i0;

    const-string v1, "POLY_OBJ"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v5, v6}, Lz9/i0;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, Lz9/i0;->H:Lz9/i0;

    invoke-static {}, Lz9/i0;->e()[Lz9/i0;

    move-result-object v0

    sput-object v0, Lz9/i0;->I:[Lz9/i0;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lz9/i0;->J:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ICC)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-char p3, p0, Lz9/i0;->C:C

    iput-char p4, p0, Lz9/i0;->D:C

    return-void
.end method

.method private static final synthetic e()[Lz9/i0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lz9/i0;

    sget-object v1, Lz9/i0;->E:Lz9/i0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lz9/i0;->F:Lz9/i0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lz9/i0;->G:Lz9/i0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lz9/i0;->H:Lz9/i0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static g()Lp7/a;
    .locals 1

    sget-object v0, Lz9/i0;->J:Lp7/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz9/i0;
    .locals 1

    const-class v0, Lz9/i0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz9/i0;

    return-object p0
.end method

.method public static values()[Lz9/i0;
    .locals 1

    sget-object v0, Lz9/i0;->I:[Lz9/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz9/i0;

    return-object v0
.end method
