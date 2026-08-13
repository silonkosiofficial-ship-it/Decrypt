.class final Lx/l$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/l;->f(Lz0/K;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lx/l$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx/l$d;

    invoke-direct {v0}, Lx/l$d;-><init>()V

    sput-object v0, Lx/l$d;->D:Lx/l$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lx/l$d;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
