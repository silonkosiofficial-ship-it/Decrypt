.class final synthetic LR8/u$b;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR8/u;->B(LR8/h;Lx7/l;)LR8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:LR8/u$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR8/u$b;

    invoke-direct {v0}, LR8/u$b;-><init>()V

    sput-object v0, LR8/u$b;->L:LR8/u$b;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "iterator()Ljava/util/Iterator;"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, LR8/h;

    const-string v3, "iterator"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR8/h;

    invoke-virtual {p0, p1}, LR8/u$b;->s(LR8/h;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public final s(LR8/h;)Ljava/util/Iterator;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
