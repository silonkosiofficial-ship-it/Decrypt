.class public final Landroidx/room/d$b;
.super Landroidx/room/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/d;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroidx/room/d;


# direct methods
.method constructor <init>(Landroidx/room/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/d$b;->C:Landroidx/room/d;

    invoke-direct {p0}, Landroidx/room/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public x1([Ljava/lang/String;)V
    .locals 7

    const-string v0, "tables"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/d$b;->C:Landroidx/room/d;

    invoke-static {v0}, Landroidx/room/d;->b(Landroidx/room/d;)LW8/N;

    move-result-object v1

    new-instance v4, Landroidx/room/d$b$a;

    iget-object v0, p0, Landroidx/room/d$b;->C:Landroidx/room/d;

    const/4 v2, 0x0

    invoke-direct {v4, p1, v0, v2}, Landroidx/room/d$b$a;-><init>([Ljava/lang/String;Landroidx/room/d;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method
