.class final LI7/n$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/n;->o(Ljava/lang/String;Ljava/lang/String;)LO7/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LI7/n$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/n$f;

    invoke-direct {v0}, LI7/n$f;-><init>()V

    sput-object v0, LI7/n$f;->D:LI7/n$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/u;LO7/u;)Ljava/lang/Integer;
    .locals 0

    .prologue
    invoke-static {p1, p2}, LO7/t;->d(LO7/u;LO7/u;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/u;

    check-cast p2, LO7/u;

    invoke-virtual {p0, p1, p2}, LI7/n$f;->a(LO7/u;LO7/u;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
