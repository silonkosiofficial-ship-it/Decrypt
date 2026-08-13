.class public Lr5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lo5/j;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:LW2/g;


# instance fields
.field private final a:Lr5/e;

.field private final b:LW2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo5/j;

    invoke-direct {v0}, Lo5/j;-><init>()V

    sput-object v0, Lr5/b;->c:Lo5/j;

    const-string v0, "hts/cahyiseot-agolai.o/1frlglgc/aclg"

    const-string v1, "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho"

    invoke-static {v0, v1}, Lr5/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lr5/b;->d:Ljava/lang/String;

    const-string v0, "AzSBpY4F0rHiHFdinTvM"

    const-string v1, "IayrSTFL9eJ69YeSUO2"

    invoke-static {v0, v1}, Lr5/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lr5/b;->e:Ljava/lang/String;

    new-instance v0, Lr5/a;

    invoke-direct {v0}, Lr5/a;-><init>()V

    sput-object v0, Lr5/b;->f:LW2/g;

    return-void
.end method

.method constructor <init>(Lr5/e;LW2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/b;->a:Lr5/e;

    iput-object p2, p0, Lr5/b;->b:LW2/g;

    return-void
.end method

.method public static synthetic a(Ln5/F;)[B
    .locals 0

    invoke-static {p0}, Lr5/b;->d(Ln5/F;)[B

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ls5/j;Lk5/M;)Lr5/b;
    .locals 4

    invoke-static {p0}, LY2/u;->f(Landroid/content/Context;)V

    invoke-static {}, LY2/u;->c()LY2/u;

    move-result-object p0

    new-instance v0, Lcom/google/android/datatransport/cct/a;

    sget-object v1, Lr5/b;->d:Ljava/lang/String;

    sget-object v2, Lr5/b;->e:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/google/android/datatransport/cct/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LY2/u;->g(LY2/f;)LW2/i;

    move-result-object p0

    const-string v0, "json"

    invoke-static {v0}, LW2/b;->b(Ljava/lang/String;)LW2/b;

    move-result-object v0

    sget-object v1, Lr5/b;->f:LW2/g;

    const-string v2, "FIREBASE_CRASHLYTICS_REPORT"

    const-class v3, Ln5/F;

    invoke-interface {p0, v2, v3, v0, v1}, LW2/i;->a(Ljava/lang/String;Ljava/lang/Class;LW2/b;LW2/g;)LW2/h;

    move-result-object p0

    new-instance v0, Lr5/e;

    invoke-interface {p1}, Ls5/j;->b()Ls5/d;

    move-result-object p1

    invoke-direct {v0, p0, p1, p2}, Lr5/e;-><init>(LW2/h;Ls5/d;Lk5/M;)V

    new-instance p0, Lr5/b;

    invoke-direct {p0, v0, v1}, Lr5/b;-><init>(Lr5/e;LW2/g;)V

    return-object p0
.end method

.method private static synthetic d(Ln5/F;)[B
    .locals 1

    sget-object v0, Lr5/b;->c:Lo5/j;

    invoke-virtual {v0, p0}, Lo5/j;->M(Ln5/F;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v1, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid input received"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Lk5/z;Z)Ll4/l;
    .locals 1

    iget-object v0, p0, Lr5/b;->a:Lr5/e;

    invoke-virtual {v0, p1, p2}, Lr5/e;->i(Lk5/z;Z)Ll4/m;

    move-result-object p1

    invoke-virtual {p1}, Ll4/m;->a()Ll4/l;

    move-result-object p1

    return-object p1
.end method
