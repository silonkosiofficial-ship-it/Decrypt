.class final LK0/r$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK0/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LK0/r$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK0/r$h;

    invoke-direct {v0}, LK0/r$h;-><init>()V

    sput-object v0, LK0/r$h;->D:LK0/r$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/h;I)LK0/h;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/h;

    check-cast p2, LK0/h;

    invoke-virtual {p2}, LK0/h;->n()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LK0/r$h;->a(LK0/h;I)LK0/h;

    move-result-object p1

    return-object p1
.end method
