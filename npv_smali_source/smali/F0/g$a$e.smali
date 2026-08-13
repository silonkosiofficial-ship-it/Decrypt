.class final LF0/g$a$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF0/g$a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/g$a$e;

    invoke-direct {v0}, LF0/g$a$e;-><init>()V

    sput-object v0, LF0/g$a$e;->D:LF0/g$a$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/g;Landroidx/compose/ui/d;)V
    .locals 0

    invoke-interface {p1, p2}, LF0/g;->g(Landroidx/compose/ui/d;)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/g;

    check-cast p2, Landroidx/compose/ui/d;

    invoke-virtual {p0, p1, p2}, LF0/g$a$e;->a(LF0/g;Landroidx/compose/ui/d;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
