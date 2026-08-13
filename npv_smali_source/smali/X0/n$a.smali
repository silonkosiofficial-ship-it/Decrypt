.class final LX0/n$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX0/n;->a(LX0/o;LX0/o;)LX0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LX0/o;


# direct methods
.method constructor <init>(LX0/o;)V
    .locals 0

    iput-object p1, p0, LX0/n$a;->D:LX0/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, LX0/n$a;->D:LX0/o;

    invoke-interface {v0}, LX0/o;->a()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX0/n$a;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
