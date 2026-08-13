.class final Li9/j$b$a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/j$b$a;->a(Li9/o$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Li9/j$b$a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/j$b$a$c;

    invoke-direct {v0}, Li9/j$b$a$c;-><init>()V

    sput-object v0, Li9/j$b$a$c;->D:Li9/j$b$a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o$c;)V
    .locals 2

    const-string v0, "$this$optional"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x2e

    invoke-static {p1, v0}, Li9/p;->b(Li9/o;C)V

    const/4 v0, 0x1

    const/16 v1, 0x9

    invoke-interface {p1, v0, v1}, Li9/o$d;->j(II)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o$c;

    invoke-virtual {p0, p1}, Li9/j$b$a$c;->a(Li9/o$c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
