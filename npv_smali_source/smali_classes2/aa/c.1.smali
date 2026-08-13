.class public final enum Laa/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Laa/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laa/c$a;
    }
.end annotation


# static fields
.field public static final D:Laa/c$a;

.field public static final enum E:Laa/c;

.field public static final enum F:Laa/c;

.field public static final enum G:Laa/c;

.field public static final enum H:Laa/c;

.field public static final enum I:Laa/c;

.field public static final enum J:Laa/c;

.field private static final synthetic K:[Laa/c;

.field private static final synthetic L:Lp7/a;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Laa/c;

    const/4 v1, 0x0

    const/16 v2, 0x78

    const-string v3, "LDPI"

    invoke-direct {v0, v3, v1, v2}, Laa/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laa/c;->E:Laa/c;

    new-instance v0, Laa/c;

    const/4 v1, 0x1

    const/16 v2, 0xa0

    const-string v3, "MDPI"

    invoke-direct {v0, v3, v1, v2}, Laa/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laa/c;->F:Laa/c;

    new-instance v0, Laa/c;

    const/4 v1, 0x2

    const/16 v2, 0xf0

    const-string v3, "HDPI"

    invoke-direct {v0, v3, v1, v2}, Laa/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laa/c;->G:Laa/c;

    new-instance v0, Laa/c;

    const/4 v1, 0x3

    const/16 v2, 0x140

    const-string v3, "XHDPI"

    invoke-direct {v0, v3, v1, v2}, Laa/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laa/c;->H:Laa/c;

    new-instance v0, Laa/c;

    const/4 v1, 0x4

    const/16 v2, 0x1e0

    const-string v3, "XXHDPI"

    invoke-direct {v0, v3, v1, v2}, Laa/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laa/c;->I:Laa/c;

    new-instance v0, Laa/c;

    const/4 v1, 0x5

    const/16 v2, 0x280

    const-string v3, "XXXHDPI"

    invoke-direct {v0, v3, v1, v2}, Laa/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laa/c;->J:Laa/c;

    invoke-static {}, Laa/c;->e()[Laa/c;

    move-result-object v0

    sput-object v0, Laa/c;->K:[Laa/c;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Laa/c;->L:Lp7/a;

    new-instance v0, Laa/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Laa/c$a;-><init>(Ly7/k;)V

    sput-object v0, Laa/c;->D:Laa/c$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Laa/c;->C:I

    return-void
.end method

.method private static final synthetic e()[Laa/c;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Laa/c;

    sget-object v1, Laa/c;->E:Laa/c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Laa/c;->F:Laa/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Laa/c;->G:Laa/c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Laa/c;->H:Laa/c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Laa/c;->I:Laa/c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Laa/c;->J:Laa/c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static i()Lp7/a;
    .locals 1

    sget-object v0, Laa/c;->L:Lp7/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Laa/c;
    .locals 1

    const-class v0, Laa/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laa/c;

    return-object p0
.end method

.method public static values()[Laa/c;
    .locals 1

    sget-object v0, Laa/c;->K:[Laa/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laa/c;

    return-object v0
.end method


# virtual methods
.method public final g()I
    .locals 1

    iget v0, p0, Laa/c;->C:I

    return v0
.end method
