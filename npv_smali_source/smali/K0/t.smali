.class public final LK0/t;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# static fields
.field public static final D:LK0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK0/t;

    invoke-direct {v0}, LK0/t;-><init>()V

    sput-object v0, LK0/t;->D:LK0/t;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/a;LK0/a;)LK0/a;
    .locals 2

    .prologue
    new-instance v0, LK0/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LK0/a;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {p2}, LK0/a;->b()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, LK0/a;->a()Li7/i;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    invoke-virtual {p2}, LK0/a;->a()Li7/i;

    move-result-object p1

    :cond_3
    invoke-direct {v0, v1, p1}, LK0/a;-><init>(Ljava/lang/String;Li7/i;)V

    return-object v0
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/a;

    check-cast p2, LK0/a;

    invoke-virtual {p0, p1, p2}, LK0/t;->a(LK0/a;LK0/a;)LK0/a;

    move-result-object p1

    return-object p1
.end method
