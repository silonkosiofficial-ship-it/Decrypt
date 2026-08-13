.class final LK8/a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/a;->e(LF8/E;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LK8/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK8/a$b;

    invoke-direct {v0}, LK8/a$b;-><init>()V

    sput-object v0, LK8/a$b;->D:LK8/a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/t0;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p1}, LF8/q0;->m(LF8/E;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/t0;

    invoke-virtual {p0, p1}, LK8/a$b;->a(LF8/t0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
