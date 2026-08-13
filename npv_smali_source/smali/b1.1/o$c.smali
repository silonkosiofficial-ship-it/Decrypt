.class final Lb1/o$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/o;-><init>(Lb1/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb1/o;


# direct methods
.method constructor <init>(Lb1/o;)V
    .locals 0

    iput-object p1, p0, Lb1/o$c;->D:Lb1/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li7/M;)V
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lb1/o$c;->D:Lb1/o;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb1/o;->i(Z)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/M;

    invoke-virtual {p0, p1}, Lb1/o$c;->a(Li7/M;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
