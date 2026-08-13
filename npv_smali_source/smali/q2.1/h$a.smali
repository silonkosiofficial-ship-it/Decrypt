.class final Lq2/h$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq2/h;-><init>(ILx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lq2/h;


# direct methods
.method constructor <init>(Lq2/h;)V
    .locals 0

    iput-object p1, p0, Lq2/h$a;->D:Lq2/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq2/f;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/h$a;->D:Lq2/h;

    invoke-virtual {v0, p1}, Lq2/h;->d(Lq2/f;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq2/f;

    invoke-virtual {p0, p1}, Lq2/h$a;->a(Lq2/f;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
