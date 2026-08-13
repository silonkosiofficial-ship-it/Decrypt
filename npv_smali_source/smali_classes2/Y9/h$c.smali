.class final LY9/h$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY9/h;->t(Ljava/net/URL;)Li7/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LY9/h$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY9/h$c;

    invoke-direct {v0}, LY9/h$c;-><init>()V

    sput-object v0, LY9/h$c;->D:LY9/h$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY9/i;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "entry"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LY9/h;->n()LY9/h$a;

    move-result-object v0

    invoke-virtual {p1}, LY9/i;->b()LX9/Q;

    move-result-object p1

    invoke-static {v0, p1}, LY9/h$a;->a(LY9/h$a;LX9/Q;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY9/i;

    invoke-virtual {p0, p1}, LY9/h$c;->a(LY9/i;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
