.class final synthetic LS/j1$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/B0;
.implements Ly7/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/j1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field private final synthetic C:Lx7/a;


# direct methods
.method constructor <init>(Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/j1$g;->C:Lx7/a;

    return-void
.end method


# virtual methods
.method public final synthetic a()J
    .locals 2

    iget-object v0, p0, LS/j1$g;->C:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/y0;

    invoke-virtual {v0}, Lo0/y0;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()Li7/i;
    .locals 1

    iget-object v0, p0, LS/j1$g;->C:Lx7/a;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Lo0/B0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Ly7/n;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LS/j1$g;->b()Li7/i;

    move-result-object v0

    check-cast p1, Ly7/n;

    invoke-interface {p1}, Ly7/n;->b()Li7/i;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, LS/j1$g;->b()Li7/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
