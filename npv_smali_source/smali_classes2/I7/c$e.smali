.class final LI7/c$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LI7/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/c$e;

    invoke-direct {v0}, LI7/c$e;-><init>()V

    sput-object v0, LI7/c$e;->D:LI7/c$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)LI7/t;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI7/t;

    invoke-direct {v0, p1}, LI7/t;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p0, p1}, LI7/c$e;->a(Ljava/lang/Class;)LI7/t;

    move-result-object p1

    return-object p1
.end method
