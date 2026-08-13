.class public final LC9/N;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC9/N$a;,
        LC9/N$b;,
        LC9/N$c;
    }
.end annotation


# static fields
.field public static final c:LC9/N$a;

.field public static final d:I


# instance fields
.field private final a:LC9/N$b;

.field private final b:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC9/N$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC9/N$a;-><init>(Ly7/k;)V

    sput-object v0, LC9/N;->c:LC9/N$a;

    const/16 v0, 0x8

    sput v0, LC9/N;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v10, LC9/N$b;

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, LC9/N$b;-><init>(ILjava/lang/String;CCLS8/o;Ljava/lang/String;LD9/c;ILy7/k;)V

    iput-object v10, p0, LC9/N;->a:LC9/N$b;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LC9/N;->b:Ljava/util/LinkedHashMap;

    return-void
.end method

.method private final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, "/?*"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LS8/r;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    return-object p1
.end method

.method private final c(Ljava/lang/String;)LC9/K;
    .locals 2

    .prologue
    new-instance v0, LC9/J;

    invoke-direct {v0}, LC9/J;-><init>()V

    iget-object v1, p0, LC9/N;->a:LC9/N$b;

    invoke-virtual {v1, v0, p1}, LC9/N$b;->q(LC9/J;Ljava/lang/String;)LD9/c;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v1, LC9/K;

    invoke-virtual {v0}, LC9/J;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-direct {v1, p1, v0}, LC9/K;-><init>(LD9/c;Ljava/util/Map;)V

    return-object v1
.end method


# virtual methods
.method public final b(Ljava/lang/String;)LC9/K;
    .locals 3

    .prologue
    const-string v0, "path"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC9/N;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD9/c;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, LC9/N;->c(Ljava/lang/String;)LC9/K;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, LC9/K;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, LC9/K;-><init>(LD9/c;Ljava/util/Map;ILy7/k;)V

    return-object p1
.end method

.method public final d(Ljava/lang/String;LD9/c;)V
    .locals 4

    .prologue
    const-string v0, "pattern"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "route"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LC9/N;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-le v1, v2, :cond_0

    invoke-virtual {p0, v0, p2}, LC9/N;->d(Ljava/lang/String;LD9/c;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v3

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "substring(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    const-string v0, "/?*"

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "/*"

    :cond_1
    sget-object v0, LC9/N;->c:LC9/N$a;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v3, v1}, LC9/N$a;->f(LC9/N$a;Ljava/lang/String;Lx7/p;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LC9/N;->b:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v0, p0, LC9/N;->a:LC9/N$b;

    invoke-virtual {v0, p1, p2}, LC9/N$b;->s(Ljava/lang/String;LD9/c;)LC9/N$b;

    return-void
.end method
