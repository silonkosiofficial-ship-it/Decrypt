.class public final LE0/a;
.super LE0/g;
.source "SourceFile"


# instance fields
.field private a:LE0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LE0/g;-><init>(Ly7/k;)V

    iput-object p1, p0, LE0/a;->a:LE0/k;

    return-void
.end method


# virtual methods
.method public a(LE0/c;)Z
    .locals 1

    .prologue
    iget-object v0, p0, LE0/a;->a:LE0/k;

    invoke-interface {v0}, LE0/k;->getKey()LE0/m;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(LE0/c;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, LE0/a;->a:LE0/k;

    invoke-interface {v0}, LE0/k;->getKey()LE0/m;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "Check failed."

    invoke-static {p1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, LE0/a;->a:LE0/k;

    invoke-interface {p1}, LE0/k;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(LE0/k;)V
    .locals 0

    iput-object p1, p0, LE0/a;->a:LE0/k;

    return-void
.end method
