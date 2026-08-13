.class final Lv/J$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/J;->Y1()J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lv/J;


# direct methods
.method constructor <init>(Lv/J;)V
    .locals 0

    iput-object p1, p0, Lv/J$a;->D:Lv/J;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    iget-object v0, p0, Lv/J$a;->D:Lv/J;

    invoke-static {v0}, Lv/J;->U1(Lv/J;)LD0/t;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LD0/u;->e(LD0/t;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lv/J$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    return-object v0
.end method
