.class final Lv2/c$a$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/c$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lv2/c$a$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv2/c$a$g;

    invoke-direct {v0}, Lv2/c$a$g;-><init>()V

    sput-object v0, Lv2/c$a$g;->D:Lv2/c$a$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz2/d;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz2/d;

    invoke-virtual {p0, p1}, Lv2/c$a$g;->a(Lz2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
