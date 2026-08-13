.class final Lg8/a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/a;->e(LB8/A;Li8/n;LF8/E;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lg8/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$c;

    invoke-direct {v0}, Lg8/a$c;-><init>()V

    sput-object v0, Lg8/a$c;->D:Lg8/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lg8/d;Lg8/w;)Ljava/lang/Object;
    .locals 1

    const-string v0, "$this$loadConstantFromProperty"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg8/d;->c()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg8/d;

    check-cast p2, Lg8/w;

    invoke-virtual {p0, p1, p2}, Lg8/a$c;->a(Lg8/d;Lg8/w;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
