.class final LO7/M$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/M;->x(Ln8/c;Lx7/l;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LO7/M$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO7/M$a;

    invoke-direct {v0}, LO7/M$a;-><init>()V

    sput-object v0, LO7/M$a;->D:LO7/M$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/K;)Ln8/c;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/K;->e()Ln8/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/K;

    invoke-virtual {p0, p1}, LO7/M$a;->a(LO7/K;)Ln8/c;

    move-result-object p1

    return-object p1
.end method
