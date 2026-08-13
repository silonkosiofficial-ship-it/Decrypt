.class final Lv8/c$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv8/c;->s(LO7/m;)LR8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lv8/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv8/c$c;

    invoke-direct {v0}, Lv8/c$c;-><init>()V

    sput-object v0, Lv8/c$c;->D:Lv8/c$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/m;)LO7/m;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/m;->b()LO7/m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/m;

    invoke-virtual {p0, p1}, Lv8/c$c;->a(LO7/m;)LO7/m;

    move-result-object p1

    return-object p1
.end method
