.class final LX7/H$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX7/H;->d(LO7/b;)LO7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LX7/H$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX7/H$a;

    invoke-direct {v0}, LX7/H$a;-><init>()V

    sput-object v0, LX7/H$a;->D:LX7/H$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/b;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/i;->a:LX7/i;

    invoke-static {p1}, Lv8/c;->t(LO7/b;)LO7/b;

    move-result-object p1

    invoke-virtual {v0, p1}, LX7/i;->b(LO7/b;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, LX7/H$a;->a(LO7/b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
