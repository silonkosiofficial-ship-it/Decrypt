.class final LS/i0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/i0;->a(Lt0/b;Ljava/lang/String;Landroidx/compose/ui/d;JLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LS/i0$c;->D:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 1

    iget-object v0, p0, LS/i0$c;->D:Ljava/lang/String;

    invoke-static {p1, v0}, LK0/u;->O(LK0/w;Ljava/lang/String;)V

    sget-object v0, LK0/h;->b:LK0/h$a;

    invoke-virtual {v0}, LK0/h$a;->d()I

    move-result v0

    invoke-static {p1, v0}, LK0/u;->X(LK0/w;I)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/i0$c;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
