.class final LM8/r$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/r$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM8/r$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/r$a$a;

    invoke-direct {v0}, LM8/r$a$a;-><init>()V

    sput-object v0, LM8/r$a$a;->D:LM8/r$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL7/g;)LF8/E;
    .locals 1

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LL7/g;->n()LF8/M;

    move-result-object p1

    const-string v0, "getBooleanType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL7/g;

    invoke-virtual {p0, p1}, LM8/r$a$a;->a(LL7/g;)LF8/E;

    move-result-object p1

    return-object p1
.end method
