.class final Lq8/g$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq8/g;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lq8/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq8/g$c;

    invoke-direct {v0}, Lq8/g$c;-><init>()V

    sput-object v0, Lq8/g$c;->D:Lq8/g$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/E;)LF8/E;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/E;

    invoke-virtual {p0, p1}, Lq8/g$c;->a(LF8/E;)LF8/E;

    move-result-object p1

    return-object p1
.end method
