.class public final Li9/P;
.super Lk9/B;
.source "SourceFile"


# instance fields
.field private final c:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 1

    const-string v0, "knownZones"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li9/m;->b()Lk9/q;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lk9/B;-><init>(Lk9/n;Ljava/util/Set;)V

    iput-object p1, p0, Li9/P;->c:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Li9/P;

    if-eqz v0, :cond_0

    check-cast p1, Li9/P;

    iget-object p1, p1, Li9/P;->c:Ljava/util/Set;

    iget-object v0, p0, Li9/P;->c:Ljava/util/Set;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Li9/P;->c:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
