.class public final Lw/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/i$a;
    }
.end annotation


# instance fields
.field private final a:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lw/i$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lw/i;->a:LV/w0;

    return-void
.end method

.method public synthetic constructor <init>(Lw/i$a;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lw/i$a$a;->a:Lw/i$a$a;

    :cond_0
    invoke-direct {p0, p1}, Lw/i;-><init>(Lw/i$a;)V

    return-void
.end method


# virtual methods
.method public final a()Lw/i$a;
    .locals 1

    iget-object v0, p0, Lw/i;->a:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/i$a;

    return-object v0
.end method

.method public final b(Lw/i$a;)V
    .locals 1

    iget-object v0, p0, Lw/i;->a:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lw/i;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lw/i;

    invoke-virtual {p1}, Lw/i;->a()Lw/i$a;

    move-result-object p1

    invoke-virtual {p0}, Lw/i;->a()Lw/i$a;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lw/i;->a()Lw/i$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContextMenuState(status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lw/i;->a()Lw/i$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
