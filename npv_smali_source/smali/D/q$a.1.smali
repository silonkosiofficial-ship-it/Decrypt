.class final LD/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/lang/Object;

.field private c:I

.field private d:Lx7/p;

.field final synthetic e:LD/q;


# direct methods
.method public constructor <init>(LD/q;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LD/q$a;->e:LD/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LD/q$a;->a:Ljava/lang/Object;

    iput-object p4, p0, LD/q$a;->b:Ljava/lang/Object;

    iput p2, p0, LD/q$a;->c:I

    return-void
.end method

.method public static final synthetic a(LD/q$a;I)V
    .locals 0

    iput p1, p0, LD/q$a;->c:I

    return-void
.end method

.method public static final synthetic b(LD/q$a;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LD/q$a;->d:Lx7/p;

    return-void
.end method

.method private final c()Lx7/p;
    .locals 3

    new-instance v0, LD/q$a$a;

    iget-object v1, p0, LD/q$a;->e:LD/q;

    invoke-direct {v0, v1, p0}, LD/q$a$a;-><init>(LD/q;LD/q$a;)V

    const v1, 0x53af4291

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final d()Lx7/p;
    .locals 1

    .prologue
    iget-object v0, p0, LD/q$a;->d:Lx7/p;

    if-nez v0, :cond_0

    invoke-direct {p0}, LD/q$a;->c()Lx7/p;

    move-result-object v0

    iput-object v0, p0, LD/q$a;->d:Lx7/p;

    :cond_0
    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD/q$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, LD/q$a;->c:I

    return v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD/q$a;->a:Ljava/lang/Object;

    return-object v0
.end method
