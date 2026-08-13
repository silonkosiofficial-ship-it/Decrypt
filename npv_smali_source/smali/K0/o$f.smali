.class final LK0/o$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/o;->r()LK0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LK0/o$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK0/o$f;

    invoke-direct {v0}, LK0/o$f;-><init>()V

    sput-object v0, LK0/o$f;->D:LK0/o$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/J;)Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p1}, LF0/J;->k0()LF0/b0;

    move-result-object p1

    const/16 v0, 0x8

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, LF0/b0;->q(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/J;

    invoke-virtual {p0, p1}, LK0/o$f;->a(LF0/J;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
