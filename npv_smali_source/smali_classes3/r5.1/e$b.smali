.class final Lr5/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final C:Lk5/z;

.field private final D:Ll4/m;

.field final synthetic E:Lr5/e;


# direct methods
.method private constructor <init>(Lr5/e;Lk5/z;Ll4/m;)V
    .locals 0

    iput-object p1, p0, Lr5/e$b;->E:Lr5/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr5/e$b;->C:Lk5/z;

    iput-object p3, p0, Lr5/e$b;->D:Ll4/m;

    return-void
.end method

.method synthetic constructor <init>(Lr5/e;Lk5/z;Ll4/m;Lr5/e$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lr5/e$b;-><init>(Lr5/e;Lk5/z;Ll4/m;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lr5/e$b;->E:Lr5/e;

    iget-object v1, p0, Lr5/e$b;->C:Lk5/z;

    iget-object v2, p0, Lr5/e$b;->D:Ll4/m;

    invoke-static {v0, v1, v2}, Lr5/e;->c(Lr5/e;Lk5/z;Ll4/m;)V

    iget-object v0, p0, Lr5/e$b;->E:Lr5/e;

    invoke-static {v0}, Lr5/e;->d(Lr5/e;)Lk5/M;

    move-result-object v0

    invoke-virtual {v0}, Lk5/M;->c()V

    iget-object v0, p0, Lr5/e$b;->E:Lr5/e;

    invoke-static {v0}, Lr5/e;->e(Lr5/e;)D

    move-result-wide v0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Delay for: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-wide v5, 0x408f400000000000L    # 1000.0

    div-double v5, v0, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v5, v6, v7

    const-string v5, "%.2f"

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " s for report: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lr5/e$b;->C:Lk5/z;

    invoke-virtual {v4}, Lk5/z;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lr5/e;->f(D)V

    return-void
.end method
