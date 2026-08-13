.class public Ll4/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ll4/P;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    iput-object v0, p0, Ll4/m;->a:Ll4/P;

    return-void
.end method

.method public constructor <init>(Ll4/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    iput-object v0, p0, Ll4/m;->a:Ll4/P;

    new-instance v0, Ll4/M;

    invoke-direct {v0, p0}, Ll4/M;-><init>(Ll4/m;)V

    invoke-virtual {p1, v0}, Ll4/a;->a(Ll4/i;)Ll4/a;

    return-void
.end method

.method static bridge synthetic f(Ll4/m;)Ll4/P;
    .locals 0

    iget-object p0, p0, Ll4/m;->a:Ll4/P;

    return-object p0
.end method


# virtual methods
.method public a()Ll4/l;
    .locals 1

    iget-object v0, p0, Ll4/m;->a:Ll4/P;

    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ll4/m;->a:Ll4/P;

    invoke-virtual {v0, p1}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ll4/m;->a:Ll4/P;

    invoke-virtual {v0, p1}, Ll4/P;->s(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Ll4/m;->a:Ll4/P;

    invoke-virtual {v0, p1}, Ll4/P;->u(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ll4/m;->a:Ll4/P;

    invoke-virtual {v0, p1}, Ll4/P;->v(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
