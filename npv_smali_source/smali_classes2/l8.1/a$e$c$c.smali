.class public final enum Ll8/a$e$c$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp8/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/a$e$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum D:Ll8/a$e$c$c;

.field public static final enum E:Ll8/a$e$c$c;

.field public static final enum F:Ll8/a$e$c$c;

.field private static G:Lp8/j$b;

.field private static final synthetic H:[Ll8/a$e$c$c;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ll8/a$e$c$c;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Ll8/a$e$c$c;-><init>(Ljava/lang/String;III)V

    sput-object v0, Ll8/a$e$c$c;->D:Ll8/a$e$c$c;

    new-instance v1, Ll8/a$e$c$c;

    const-string v3, "INTERNAL_TO_CLASS_ID"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4, v4}, Ll8/a$e$c$c;-><init>(Ljava/lang/String;III)V

    sput-object v1, Ll8/a$e$c$c;->E:Ll8/a$e$c$c;

    new-instance v3, Ll8/a$e$c$c;

    const-string v5, "DESC_TO_CLASS_ID"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6, v6}, Ll8/a$e$c$c;-><init>(Ljava/lang/String;III)V

    sput-object v3, Ll8/a$e$c$c;->F:Ll8/a$e$c$c;

    const/4 v5, 0x3

    new-array v5, v5, [Ll8/a$e$c$c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ll8/a$e$c$c;->H:[Ll8/a$e$c$c;

    new-instance v0, Ll8/a$e$c$c$a;

    invoke-direct {v0}, Ll8/a$e$c$c$a;-><init>()V

    sput-object v0, Ll8/a$e$c$c;->G:Lp8/j$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p4, p0, Ll8/a$e$c$c;->C:I

    return-void
.end method

.method public static e(I)Ll8/a$e$c$c;
    .locals 1

    .prologue
    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Ll8/a$e$c$c;->F:Ll8/a$e$c$c;

    return-object p0

    :cond_1
    sget-object p0, Ll8/a$e$c$c;->E:Ll8/a$e$c$c;

    return-object p0

    :cond_2
    sget-object p0, Ll8/a$e$c$c;->D:Ll8/a$e$c$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ll8/a$e$c$c;
    .locals 1

    const-class v0, Ll8/a$e$c$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll8/a$e$c$c;

    return-object p0
.end method

.method public static values()[Ll8/a$e$c$c;
    .locals 1

    sget-object v0, Ll8/a$e$c$c;->H:[Ll8/a$e$c$c;

    invoke-virtual {v0}, [Ll8/a$e$c$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll8/a$e$c$c;

    return-object v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Ll8/a$e$c$c;->C:I

    return v0
.end method
