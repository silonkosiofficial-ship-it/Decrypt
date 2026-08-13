.class final Lv2/c$b$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/c$b;->o1()J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lv2/c$b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv2/c$b$c;

    invoke-direct {v0}, Lv2/c$b$c;-><init>()V

    sput-object v0, Lv2/c$b$c;->D:Lv2/c$b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz2/h;)Ljava/lang/Long;
    .locals 2

    const-string v0, "obj"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lz2/h;->o1()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz2/h;

    invoke-virtual {p0, p1}, Lv2/c$b$c;->a(Lz2/h;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
